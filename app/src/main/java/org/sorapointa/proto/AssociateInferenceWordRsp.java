package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AssociateInferenceWordRsp {
    public enum CPCLGHEALEH {
        @Tag(tag=0) None ,
        @Tag(tag=490) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=14) public Integer associateWordId = null;
    @Tag(tag=5) public Integer baseWordId = null;
    @Tag(tag=11) public Integer pageId = null;
    @Tag(tag=13,isSigned=true) public Integer retcode = null;
}
