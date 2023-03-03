package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.FurnitureMakeBeHelpedData.*;
import org.sorapointa.proto.FurnitureMakeBeHelpedData;
import org.sorapointa.proto.FurnitureMakeSlot.*;
import org.sorapointa.proto.FurnitureMakeSlot;

public class FurnitureMakeBeHelpedNotify {
    @Tag(tag=7) public FurnitureMakeSlot furnitureMakeSlot = null;
    @Tag(tag=2) public FurnitureMakeBeHelpedData furnitureMakeHelpedData = null;
}
