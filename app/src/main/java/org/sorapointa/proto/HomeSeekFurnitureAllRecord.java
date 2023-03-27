package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HomeSeekFurnitureAllRecord {
    @Tag(tag=5) public List<HomeSeekFurnitureOneRecord> recordList = new ArrayList<>();
}
