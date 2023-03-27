package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class BeginCameraSceneLookWithTemplateNotify {
    public enum KDFDCPCDOJA {
        @Tag(tag=0) None ,
        @Tag(tag=3201) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=9) public Integer templateId = null;
    @Tag(tag=4) public Vector lookPos = null;
    @Tag(tag=3) public Integer followType = null;
    @Tag(tag=8) public List<String> otherParams = new ArrayList<>();
    @Tag(tag=14) public Integer entityId = null;
    @Tag(tag=7) public Vector followPos = null;
}
