CREATE TABKE IF NOT EXISIS 'deed'{
	'deIDX' int(30) NOT NULL AND AUTO_INCREASE COMMENT='증서번호',
	'UID' VARCHAR(20) NOT NULL COMMNET '사용자아이디',
	'isUSED' CHAR(1) NOT NULL COMMENT '사용여부'
} ENGINE=InnoDB DEFAULT CHARSET=stf8mb3 COMMENT='후원증'