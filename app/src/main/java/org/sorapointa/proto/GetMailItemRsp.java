package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.EquipParam.*;
import org.sorapointa.proto.EquipParam;

public class GetMailItemRsp {
    @Tag(tag=7,isSigned=true) public Integer retcode = null;
    @Tag(tag=3) public List<Integer> mailIdList = new ArrayList<>();
    @Tag(tag=2) public List<EquipParam> itemList = new ArrayList<>();
}
