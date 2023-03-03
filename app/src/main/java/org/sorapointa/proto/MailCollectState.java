package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum MailCollectState {
        @Tag(tag=0) MAIL_COLLECT_STATE_COLLECTIBLE_UNKNOWN ,
        @Tag(tag=1) MAIL_COLLECT_STATE_NOT_COLLECTIBLE ,
        @Tag(tag=2) MAIL_COLLECT_STATE_COLLECTIBLE_UNCOLLECTED ,
        @Tag(tag=3) MAIL_COLLECT_STATE_COLLECTIBLE_COLLECTED ;
}
