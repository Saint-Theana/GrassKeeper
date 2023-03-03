package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ItemParam.*;
import org.sorapointa.proto.ItemParam;

public class TakeCompoundOutputRsp {
    @Tag(tag=6) public List<ItemParam> itemList = new ArrayList<>();
    @Tag(tag=2,isSigned=true) public Integer retcode = null;
}
