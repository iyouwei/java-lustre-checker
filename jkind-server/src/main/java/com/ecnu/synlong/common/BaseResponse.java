package com.ecnu.synlong.common;

import lombok.Data;

@Data
public class BaseResponse<T> {
	private int code;
	private T data;
	private String message;

	public BaseResponse(int code, T data, String message) {
		this.code = code;
		this.data = data;
		this.message = message;
	}

	public BaseResponse() {
	}

	public boolean ok() {
		return code == HttpCode.OK;
	}

	public static <T> BaseResponse<T> success(T data) {
		return new BaseResponse<>(HttpCode.OK, data, null);
	}

	public static <T> BaseResponse<T> error(String message) {
		return new BaseResponse<>(HttpCode.ERROR, null, message);
	}
}
