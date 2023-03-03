package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.FurnitureMakeSlot.*;
import org.sorapointa.proto.FurnitureMakeSlot;

public class FurnitureMakeCancelRsp {
    @Tag(tag=3,isSigned=true) public Integer retcode = null;
    @Tag(tag=2) public Integer makeId = null;
    @Tag(tag=15) public FurnitureMakeSlot furnitureMakeSlot = null;
}
