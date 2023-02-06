/**
 * Dependency Library
 * - commons-io:2.11.0
 * 
 * @author jodongik
 *
 */
package org.dongikjo.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileUtil {

	@Autowired
	DateUtil dateUtil;

	public List<FileVo> getFileVoList(List<MultipartFile> uploadFileVo) {
		List<FileVo> list = new ArrayList<>();
		for (MultipartFile file : uploadFileVo) {
			FileVo fileVo = new FileVo();
			fileVo.setUuid(UUID.randomUUID());
			fileVo.setOriginalFilename(file.getOriginalFilename());
			fileVo.setExtension(FilenameUtils.getExtension(file.getOriginalFilename()));
			fileVo.setFileSize(file.getSize());
			fileVo.setContentType(file.getContentType());
			fileVo.setCreateTime(dateUtil.yyyyMMddHHmmss());
			list.add(fileVo);
		}
		return list;

	}

}
