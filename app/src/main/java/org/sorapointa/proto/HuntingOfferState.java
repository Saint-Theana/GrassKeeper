package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum HuntingOfferState {
        @Tag(tag=0) HUNTING_OFFER_STATE_NONE ,
        @Tag(tag=1) HUNTING_OFFER_STATE_STARTED ,
        @Tag(tag=2) HUNTING_OFFER_STATE_UNSTARTED ,
        @Tag(tag=3) HUNTING_OFFER_STATE_SUCC ;
}
