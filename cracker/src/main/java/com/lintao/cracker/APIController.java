package com.lintao.cracker;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v3")
public class APIController {

    @RequestMapping("/user/login")
    public String Login(){
        return "{\"status\":0,\"msg\":\"登录成功\",\"data\":{\"id\":\"433482\",\"register_type\":\"2\",\"username\":\"aujmwxo688\",\"password\":null,\"mobile\":null,\"email\":\"2534324260@qq.com\",\"email_hash\":null,\"random\":\"RNX7dnzCmCfSXJw4H\",\"token\":\"AZlNAF9PBlMiF9fG\",\"is_active\":\"1\",\"add_time\":\"1614691307\",\"ipusc\":\"1\",\"tokens\":{\"tk10\":\"Y2xpZW50QEhINzJzYmt3OSoxYmprdmM4MjFLbDJhenBJb1dO\",\"tk3-\":\"MjAxNTExMzAwMDAwMDY5NjFAal9PTUN0RElqN1g3bURabmxLZ1A=\",\"tk12\":\"Y2xpZW50QElvMV43MmhMSzE5NyMyKWphakF6aWZiJSQ1MmJrMW8=\",\"tk1-\":\"bnVsbEAyNC43MjIzMWM3MmFmY2EzZGU3NmE4MmJmOTU0YTQ3MWM2Yy4yNTkyMDAwLjE1ODg5OTQyNjMuMjgyMzM1LTc3NjQxODA=\",\"tk11\":\"Y2xpZW50QG1rKjczaFVicWlpb0hVSXNQYW1sJGglZ3FL\",\"tk2-\":\"bmNjcGtjNWdtNmp3enN2emFlZG9vY21kZWh5MmlyenF6Znd6MndpZ0AxNjMxOA==\"},\"login_time\":1614736571}}";
    }

    @RequestMapping("/ucenter/get_credit")
    public String GetCredit(){
        return "{\"status\":0,\"msg\":\"获取用户积分成功\",\"data\":{\"total_credit\":\"60000\"}}";
    }

    @RequestMapping("/ucenter/privilege_list")
    public String GetPrivilege(){
        return "{\"status\":0,\"msg\":\"获取用户特权成功\",\"data\":[{\"id\":\"5556\",\"user_id\":\"433482\",\"privilege_id\":\"1\",\"period\":null,\"add_time\":\"1575448126\"},{\"id\":\"5992\",\"user_id\":\"433482\",\"privilege_id\":\"2\",\"period\":null,\"add_time\":\"1578123525\"}]}";
    }

    @RequestMapping("/ucenter/attendance_info")
    public String GetAttendance(){
        return "{\"status\":0,\"msg\":\"获取签到信息成功\",\"data\":{\"total_credit\":\"60\",\"is_attendance\":1}}";
    }

    @RequestMapping("/log/boot")
    public String GetBoot(){
        return "{\"status\":0,\"msg\":\"OK\",\"data\":{\"log_id\":\"15784877\"}}";
    }

    @RequestMapping("/ucenter/deduct_credit")
    public String GetDeduct(){
        return "{\"status\":0,\"msg\":\"积分不足\"}";
    }
}
