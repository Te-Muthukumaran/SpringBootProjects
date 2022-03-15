package com.te.resumebuilder.beans;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResumeResponse {

	private boolean error;

	private Object data;
}
