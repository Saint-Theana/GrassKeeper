package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ItemParam.*;
import org.sorapointa.proto.ItemParam;

public class SpiceActivityProcessFoodRsp {
    public enum SpiceActivityProcessFoodRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8845) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=13) public List<ItemParam> specialFoodList = new ArrayList<>();
    @Tag(tag=10) public List<ItemParam> normalFoodList = new ArrayList<>();
    @Tag(tag=7,isSigned=true) public Integer retcode = null;
}
