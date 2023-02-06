package org.dongikjo.demo;

import java.util.UUID;

import lombok.Data;

@Data
public class FileVo {
	private UUID uuid;
	private String originalFilename;
	private Long fileSize;
	private String extension;
	private String contentType;
	private String createTime;
}
