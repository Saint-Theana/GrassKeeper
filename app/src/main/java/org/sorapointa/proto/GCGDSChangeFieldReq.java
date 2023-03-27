package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGDSChangeFieldReq {
    public enum OGLNJLNHADG {
        @Tag(tag=0) None ,
        @Tag(tag=7691) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=15) public Integer deckId = null;
    @Tag(tag=2) public Integer fieldId = null;
}
