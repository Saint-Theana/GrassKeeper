package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.CompoundBoostTakeStatusType.*;
import org.sorapointa.proto.CompoundBoostTakeStatusType;
import org.sorapointa.proto.CompoundQueueData.*;
import org.sorapointa.proto.CompoundQueueData;
import org.sorapointa.proto.ItemParam.*;
import org.sorapointa.proto.ItemParam;

public class PlayerCompoundMaterialBoostRsp {
    @Tag(tag=2) public List<ItemParam> takeItemList = new ArrayList<>();
    @Tag(tag=6) public Integer takeStatus = null;
    @Tag(tag=7,isSigned=true) public Integer retcode = null;
    @Tag(tag=1) public List<CompoundQueueData> compoundQueueDataList = new ArrayList<>();
}
