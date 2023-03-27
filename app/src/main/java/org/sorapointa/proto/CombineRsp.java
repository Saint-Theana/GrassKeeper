package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class CombineRsp {
    public enum CombineRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=630) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=10) public Integer combineCount = null;
    @Tag(tag=13) public List<ItemParam> resultItemList = new ArrayList<>();
    @Tag(tag=7) public Long avatarGuid = null;
    @Tag(tag=1) public List<ItemParam> totalExtraItemList = new ArrayList<>();
    @Tag(tag=12,isSigned=true) public Integer retcode = null;
    @Tag(tag=3) public List<ItemParam> totalRandomItemList = new ArrayList<>();
    @Tag(tag=5) public Integer combineId = null;
    @Tag(tag=2) public List<ItemParam> costItemList = new ArrayList<>();
    @Tag(tag=4) public List<ItemParam> totalReturnItemList = new ArrayList<>();
}
