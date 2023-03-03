package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.FurnitureMakeSlot.*;
import org.sorapointa.proto.FurnitureMakeSlot;
import org.sorapointa.proto.ItemParam.*;
import org.sorapointa.proto.ItemParam;

public class TakeFurnitureMakeRsp {
    @Tag(tag=8) public FurnitureMakeSlot furnitureMakeSlot = null;
    @Tag(tag=2) public List<ItemParam> returnItemList = new ArrayList<>();
    @Tag(tag=6) public Integer makeId = null;
    @Tag(tag=9,isSigned=true) public Integer retcode = null;
    @Tag(tag=14) public List<ItemParam> outputItemList = new ArrayList<>();
}
