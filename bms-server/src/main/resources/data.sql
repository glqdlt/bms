INSERT INTO `role` (`role_id`, `label`) VALUES ('9', 'root');
INSERT INTO `role` (`role_id`, `label`) VALUES ('8', 'admin');
INSERT INTO `role` (`role_id`, `label`) VALUES ('1', 'user');

INSERT INTO `member` (`email`, `id`, `name`, `password`, `role_id`) VALUES ('root@dbs.com', 'root', 'root', 'root12345', '9');

INSERT INTO `tag` (`tag`, `member_id`) VALUES ('원서', '1');
INSERT INTO `tag` (`tag`, `member_id`) VALUES ('자기 개발', '1');
INSERT INTO `tag` (`tag`, `member_id`) VALUES ('프로그래밍', '1');
INSERT INTO `tag` (`tag`, `member_id`) VALUES ('데이터베이스', '1');
INSERT INTO `tag` (`tag`, `member_id`) VALUES ('개발 문화', '1');
INSERT INTO `tag` (`tag`, `member_id`) VALUES ('일반', '1');
