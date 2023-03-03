package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.AranaraCollectionState.*;
import org.sorapointa.proto.AranaraCollectionState;

public class AddAranaraCollectionNotify {
    @Tag(tag=7) public Integer collectionType = null;
    @Tag(tag=12) public Integer targetState = null;
    @Tag(tag=15) public Integer fromState = null;
    @Tag(tag=8) public Integer collectionId = null;
}
