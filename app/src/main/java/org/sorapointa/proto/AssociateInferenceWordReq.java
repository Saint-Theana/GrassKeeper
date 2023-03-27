package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AssociateInferenceWordReq {
    public enum NCOBIJLLDLL {
        @Tag(tag=0) None ,
        @Tag(tag=456) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=11) public Integer baseWordId = null;
    @Tag(tag=3) public Integer pageId = null;
    @Tag(tag=13) public Integer associateWordId = null;
}
