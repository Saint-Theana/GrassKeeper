package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class UnlockedFurnitureFormulaDataNotify {
    @Tag(tag=15) public List<Integer> furnitureIdList = new ArrayList<>();
    @Tag(tag=11) public Boolean isAll = null;
}
