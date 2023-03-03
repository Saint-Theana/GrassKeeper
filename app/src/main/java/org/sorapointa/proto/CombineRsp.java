package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ItemParam.*;
import org.sorapointa.proto.ItemParam;

public class CombineRsp {
    @Tag(tag=3) public List<ItemParam> costItemList = new ArrayList<>();
    @Tag(tag=7,isSigned=true) public Integer retcode = null;
    @Tag(tag=6) public List<ItemParam> totalExtraItemList = new ArrayList<>();
    @Tag(tag=11) public Integer combineId = null;
    @Tag(tag=9) public List<ItemParam> totalRandomItemList = new ArrayList<>();
    @Tag(tag=2) public List<ItemParam> resultItemList = new ArrayList<>();
    @Tag(tag=13) public Integer combineCount = null;
    @Tag(tag=12) public List<ItemParam> totalReturnItemList = new ArrayList<>();
    @Tag(tag=10) public Long avatarGuid = null;
}
