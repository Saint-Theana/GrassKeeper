package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GetMailItemRsp {
    public enum GetMailItemRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1420) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=9) public List<EquipParam> itemList = new ArrayList<>();
    @Tag(tag=6) public List<Integer> mailIdList = new ArrayList<>();
    @Tag(tag=12,isSigned=true) public Integer retcode = null;
}
