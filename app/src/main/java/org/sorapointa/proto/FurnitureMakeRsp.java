package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.FurnitureMakeBeHelpedData.*;
import org.sorapointa.proto.FurnitureMakeBeHelpedData;
import org.sorapointa.proto.FurnitureMakeHelpData.*;
import org.sorapointa.proto.FurnitureMakeHelpData;
import org.sorapointa.proto.FurnitureMakeInfo.*;
import org.sorapointa.proto.FurnitureMakeInfo;
import org.sorapointa.proto.FurnitureMakeSlot.*;
import org.sorapointa.proto.FurnitureMakeSlot;

public class FurnitureMakeRsp {
    @Tag(tag=13) public List<FurnitureMakeBeHelpedData> helpedDataList = new ArrayList<>();
    @Tag(tag=4) public List<FurnitureMakeInfo> makeInfoList = new ArrayList<>();
    @Tag(tag=1) public FurnitureMakeSlot furnitureMakeSlot = null;
    @Tag(tag=3,isSigned=true) public Integer retcode = null;
    @Tag(tag=2) public List<FurnitureMakeHelpData> helpDataList = new ArrayList<>();
}
