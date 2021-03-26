package com.company.chpater07_inheritance.class_inherit;

public class DmbCellPhoneExample {
    public static void main(String[] args) {
        DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "검정", 10);

        System.out.println("모델: " + dmbCellPhone.model);
        System.out.println("색상: " + dmbCellPhone.color);

        System.out.println("채널: " + dmbCellPhone.channel);

        dmbCellPhone.powerON();
        dmbCellPhone.bell();

        dmbCellPhone.sedVoice("여보세요");
        dmbCellPhone.receiveVoice("안녕하세요. 저는 herryboro입니다.");
        dmbCellPhone.hangUp();

        dmbCellPhone.turnOnDmb();
        dmbCellPhone.changeChannelDmb(11);
        dmbCellPhone.turnOffDmb();
    }
}
