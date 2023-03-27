package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ChangeGameTimeReq {
    public enum ChangeGameTimeReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=162) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=7) public Integer extraDays = null;
    @Tag(tag=6) public Boolean isForceSet = null;
    @Tag(tag=9) public Integer gameTime = null;
}
