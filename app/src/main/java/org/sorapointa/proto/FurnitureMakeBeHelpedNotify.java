package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.FurnitureMakeSlot.*;
import org.sorapointa.proto.FurnitureMakeSlot;
import org.sorapointa.proto.FurnitureMakeBeHelpedData.*;
import org.sorapointa.proto.FurnitureMakeBeHelpedData;

public class FurnitureMakeBeHelpedNotify {
    public enum FurnitureMakeBeHelpedNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4522) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=2) public FurnitureMakeSlot furnitureMakeSlot = null;
    @Tag(tag=12) public FurnitureMakeBeHelpedData furnitureMakeHelpedData = null;
}
