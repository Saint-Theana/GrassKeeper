package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.AranaraCollectionState.*;
import org.sorapointa.proto.AranaraCollectionState;

public class AranaraCollectionSuite {
    public static class MapCollectionIdStateMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    @Tag(tag=6) public List<MapCollectionIdStateMap> collectionIdStateMap = new ArrayList<>();
    @Tag(tag=12) public Integer collectionType = null;
}
