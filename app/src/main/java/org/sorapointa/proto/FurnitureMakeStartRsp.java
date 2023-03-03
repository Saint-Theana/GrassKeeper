package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.FurnitureMakeSlot.*;
import org.sorapointa.proto.FurnitureMakeSlot;

public class FurnitureMakeStartRsp {
    @Tag(tag=5) public FurnitureMakeSlot furnitureMakeSlot = null;
    @Tag(tag=8,isSigned=true) public Integer retcode = null;
}
