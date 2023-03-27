package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum HuntingOfferState {
        @Tag(tag=0) None ,
        @Tag(tag=1) Started ,
        @Tag(tag=2) Unstarted ,
        @Tag(tag=3) Succ ;
}
