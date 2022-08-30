﻿/*CREATE TABLE recipient (
       recipient_id         VARCHAR2(20) PRIMARY KEY,
       name                 VARCHAR2(20) NULL,
       password             VARCHAR2(20) NULL,
       receiveHopeContent   VARCHAR2(50) NULL
); */

package probono.model.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "recipient")
public class RecipientDTO extends People {
	@Column
	private String receiveContent;

	public RecipientDTO(String id, String name, String password, String receiveContent) {
		super(id, name, password);
		this.receiveContent = receiveContent;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(" 4. 제공받는 대상자가 제공받는 서비스 : ");
		builder.append(receiveContent);
		return builder.toString();
	}
}
