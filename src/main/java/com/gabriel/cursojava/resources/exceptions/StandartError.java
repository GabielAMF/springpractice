package com.gabriel.cursojava.resources.exceptions;

import java.io.Serializable;

public class StandartError implements Serializable{


		private static final long serialVersionUID = 1L;
		
		private Integer status;
		private String mensagem;
		private Long timeStamp;
		
		public StandartError(Integer status, String mensagem, Long timeStamp) {
			super();
			this.status = status;
			this.mensagem = mensagem;
			this.timeStamp = timeStamp;
		}

		public Integer getStatus() {
			return status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public String getMensagem() {
			return mensagem;
		}

		public void setMensagem(String mensagem) {
			this.mensagem = mensagem;
		}

		public Long getTimeStamp() {
			return timeStamp;
		}

		public void setTimeStamp(Long timeStamp) {
			this.timeStamp = timeStamp;
		}
		
		
}
