package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum AranaraCollectionState {
        @Tag(tag=0) ARANARA_COLLECTION_STATE_NONE ,
        @Tag(tag=1) ARANARA_COLLECTION_STATE_COLLECTABLE ,
        @Tag(tag=2) ARANARA_COLLECTION_STATE_COLLECTED ,
        @Tag(tag=3) ARANARA_COLLECTION_STATE_FINISHED ;
}
