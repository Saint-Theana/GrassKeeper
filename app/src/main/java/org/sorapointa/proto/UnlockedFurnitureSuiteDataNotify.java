package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class UnlockedFurnitureSuiteDataNotify {
    @Tag(tag=10) public Boolean isAll = null;
    @Tag(tag=5) public List<Integer> furnitureSuiteIdList = new ArrayList<>();
}
