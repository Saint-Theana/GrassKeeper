package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class DestroyMaterialRsp {
    public enum DestroyMaterialRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=637) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=7) public List<Integer> itemIdList = new ArrayList<>();
    @Tag(tag=12,isSigned=true) public Integer retcode = null;
    @Tag(tag=13) public List<Integer> itemCountList = new ArrayList<>();
}
