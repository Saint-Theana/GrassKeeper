package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class VintageCampGroupBundleRegisterNotify {
    public enum BHMMDEHNBLK {
        @Tag(tag=0) None ,
        @Tag(tag=23285) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=5) public Integer groupBundleId = null;
}
