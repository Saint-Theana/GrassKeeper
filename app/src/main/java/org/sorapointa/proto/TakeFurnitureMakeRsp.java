package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.FurnitureMakeSlot.*;
import org.sorapointa.proto.FurnitureMakeSlot;
import org.sorapointa.proto.ItemParam.*;
import org.sorapointa.proto.ItemParam;

public class TakeFurnitureMakeRsp {
    public enum TakeFurnitureMakeRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4806) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=7) public List<ItemParam> returnItemList = new ArrayList<>();
    @Tag(tag=6) public FurnitureMakeSlot furnitureMakeSlot = null;
    @Tag(tag=4) public Integer makeId = null;
    @Tag(tag=1) public List<ItemParam> outputItemList = new ArrayList<>();
    @Tag(tag=10,isSigned=true) public Integer retcode = null;
}
