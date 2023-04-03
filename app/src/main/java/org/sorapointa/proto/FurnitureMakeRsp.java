package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.FurnitureMakeSlot.*;
import org.sorapointa.proto.FurnitureMakeSlot;
import org.sorapointa.proto.FurnitureMakeHelpData.*;
import org.sorapointa.proto.FurnitureMakeHelpData;
import org.sorapointa.proto.FurnitureMakeMakeInfo.*;
import org.sorapointa.proto.FurnitureMakeMakeInfo;
import org.sorapointa.proto.FurnitureMakeBeHelpedData.*;
import org.sorapointa.proto.FurnitureMakeBeHelpedData;

public class FurnitureMakeRsp {
    public enum FurnitureMakeRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4802) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=5,isSigned=true) public Integer retcode = null;
    @Tag(tag=3) public FurnitureMakeSlot furnitureMakeSlot = null;
    @Tag(tag=7) public List<FurnitureMakeHelpData> helpDataList = new ArrayList<>();
    @Tag(tag=8) public List<FurnitureMakeMakeInfo> makeInfoList = new ArrayList<>();
    @Tag(tag=14) public List<FurnitureMakeBeHelpedData> helpedDataList = new ArrayList<>();
}
