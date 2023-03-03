package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class DestroyMaterialRsp {
    @Tag(tag=12) public List<Integer> itemCountList = new ArrayList<>();
    @Tag(tag=13) public List<Integer> itemIdList = new ArrayList<>();
    @Tag(tag=11,isSigned=true) public Integer retcode = null;
}
