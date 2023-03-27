package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class CharAmusementSettleNotify {
    public enum PPKKMCEDOFG {
        @Tag(tag=0) None ,
        @Tag(tag=21939) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=9) public Integer finishTime = null;
    @Tag(tag=11) public Boolean isNewRecord = null;
    @Tag(tag=13) public Boolean isSucc = null;
}
