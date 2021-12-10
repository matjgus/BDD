package com.board.study.entity;

import java.time.LocalDateTime;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Getter;

@Getter
// JPA Entity Ŭ�������� BaseTimeEntity�� ����� ��� �ʵ��(createdDate, modifiedDate)�� Į������ �ν��ϵ��� �մϴ�.
@MappedSuperclass
// BaseEntity Ŭ������ Auditing ����� ���Խ�ŵ�ϴ�.
@EntityListeners(AuditingEntityListener.class)
public class BaseTimeEntity {
	
	// Entity�� �����Ǿ� ����� �� �ð��� �ڵ� ����ȴ�.
	@CreatedDate
	private LocalDateTime registerTime;
	
	// ��ȸ�� Entity�� ���� ������ �� �ð��� �ڵ� ����ȴ�.
	@LastModifiedDate
	private LocalDateTime	updateTime;
}