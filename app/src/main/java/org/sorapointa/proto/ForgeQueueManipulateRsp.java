package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ForgeQueueManipulateType.*;
import org.sorapointa.proto.ForgeQueueManipulateType;
import org.sorapointa.proto.ItemParam.*;
import org.sorapointa.proto.ItemParam;

public class ForgeQueueManipulateRsp {
    @Tag(tag=4) public Integer manipulateType = null;
    @Tag(tag=13) public List<ItemParam> extraOutputItemList = new ArrayList<>();
    @Tag(tag=10) public List<ItemParam> returnItemList = new ArrayList<>();
    @Tag(tag=1,isSigned=true) public Integer retcode = null;
    @Tag(tag=9) public List<ItemParam> outputItemList = new ArrayList<>();
}
