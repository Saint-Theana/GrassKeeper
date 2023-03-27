package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum AranaraCollectionState {
        @Tag(tag=0) None ,
        @Tag(tag=1) Collectable ,
        @Tag(tag=2) Collected ,
        @Tag(tag=3) Finished ;
}
