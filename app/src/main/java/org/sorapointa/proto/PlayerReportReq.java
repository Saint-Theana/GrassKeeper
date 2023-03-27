package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PlayerReportReq {
    public enum PlayerReportReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4053) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=10) public String content = null;
    @Tag(tag=8) public Integer reason = null;
    @Tag(tag=6) public Integer targetUid = null;
    @Tag(tag=12) public Integer targetHomeModuleId = null;
    @Tag(tag=2) public String targetHomeModuleName = null;
}
