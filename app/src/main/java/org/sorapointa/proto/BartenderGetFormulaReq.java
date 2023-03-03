package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ItemParam.*;
import org.sorapointa.proto.ItemParam;

public class BartenderGetFormulaReq {
    @Tag(tag=7) public List<ItemParam> itemList = new ArrayList<>();
    @Tag(tag=4) public Integer questId = null;
}
