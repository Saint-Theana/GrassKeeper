package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.EquipParam.*;
import org.sorapointa.proto.EquipParam;

public class EquipParamList {
    @Tag(tag=1) public List<EquipParam> itemList = new ArrayList<>();
}
