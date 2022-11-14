package com.jf;

/**
 * @Description 活动类
 * @Author lzzz
 * @Date 2022-09-25 17:39
 */
public class Activity {

    public void acquireActivityData(String name){
        //校验活动是否活跃
        if(name.equals("神秘商店") || name.equals("无限活力")){
        }else{
            throw new RuntimeException("活动已结束");
        }
        boolean isLogin = true;
        if(isLogin){

        }else{
            throw new RuntimeException("用户未登录");
        }
        System.out.println("正在获取奖励");
    }

    public void distributeRewards(){
        System.out.println("正在分配奖励.....");
    }
}
