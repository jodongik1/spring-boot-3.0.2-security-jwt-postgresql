package org.dongikjo.demo;

import java.util.List;

import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/file")
public class FileConftroller {
	 
	FileUtil fileUtil;
	
	public FileConftroller(FileUtil fileUtil) {
		this.fileUtil=fileUtil;
	}
	
	@PostMapping(value = "/upload",  consumes = {"multipart/form-data","application/x-www-form-urlencoded"}) 
	public List<FileVo> postUpload(@RequestPart("files") List<MultipartFile> files, UserVo userVo) throws Exception { 
		// curl -X POST http://localhost:8080/api/file/upload -F files=@err_log.log -F files=@testerr_log.log -F "id=1" -F "email=jodongik.prj@gmail.com" -F "password=112233"
		return fileUtil.getFileVoList(files);  
	}
	
	@PutMapping(value = "/upload",  consumes = {"multipart/form-data","application/x-www-form-urlencoded"}) 
	public List<FileVo> patchUpload(@RequestPart("files") List<MultipartFile> files, UserVo userVo) throws Exception { 
		// curl -X PATCH http://localhost:8080/api/file/upload -F files=@err_log.log -F files=@testerr_log.log -F "id=1" -F "email=jodongik.prj@gmail.com" -F "password=112233"
		return fileUtil.getFileVoList(files); 
	}
	
	@PatchMapping(value = "/upload",  consumes = {"multipart/form-data","application/x-www-form-urlencoded"}) 
	public List<FileVo> putUpload(@RequestPart("files") List<MultipartFile> files, UserVo userVo) throws Exception { 
		// curl -X PUT http://localhost:8080/api/file/upload -F files=@err_log.log -F files=@testerr_log.log -F "id=1" -F "email=jodongik.prj@gmail.com" -F "password=112233"
		return fileUtil.getFileVoList(files); 
	}
}
