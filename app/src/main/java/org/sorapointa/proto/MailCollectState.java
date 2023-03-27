package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum MailCollectState {
        @Tag(tag=0) MailCollectibleUnkonw ,
        @Tag(tag=1) MailNotCollectible ,
        @Tag(tag=2) MailCollectibleUncollected ,
        @Tag(tag=3) MailCollectibleCollected ;
}
