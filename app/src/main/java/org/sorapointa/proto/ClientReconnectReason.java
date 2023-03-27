package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum ClientReconnectReason {
        @Tag(tag=0) ClientReconnnectNone ,
        @Tag(tag=1) ClientReconnnectQuitMp ;
}
