package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SubmitInferenceWordRsp {
    public enum HDBJOOIELFD {
        @Tag(tag=0) None ,
        @Tag(tag=495) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=7) public Integer conclusionId = null;
    @Tag(tag=13) public Integer pageId = null;
    @Tag(tag=6) public Integer wordId = null;
    @Tag(tag=8,isSigned=true) public Integer retcode = null;
}
