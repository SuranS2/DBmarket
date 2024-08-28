package com.example.team1.Prometheus.exception;

public class NotFoundUserbyUserId extends IllegalArgumentException {
    public NotFoundUserbyUserId(Long UserId) {
        super("\'사용자 ID " + UserId + "\' 이 존재하지 않습니다.");
    }
}
