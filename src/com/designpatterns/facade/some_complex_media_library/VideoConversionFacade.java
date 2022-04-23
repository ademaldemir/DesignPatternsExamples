package com.designpatterns.facade.some_complex_media_library;

import java.io.File;

public class VideoConversionFacade {
    public File convertVideo(String fileName, String format) {
        System.out.println("VideoConversionFacade: conversion started");
        VideoFile file = new VideoFile(fileName);
        Codec sourceCodec = CodecFactory.extract(file);
        Codec destinationCodec;
        if (format.equals("mp4")) {
            destinationCodec = new MPEG4CompressionCodec();
        } else {
            destinationCodec = new OggCompressionCodec();
        }
        VideoFile buffer = BitRateReader.read(file, sourceCodec);
        VideoFile intermadiateResult = BitRateReader.convert(buffer, destinationCodec);
        File result = (new AudioMixer()).fix(intermadiateResult);
        System.out.println("VideoConversionFacade: conversion completed..");
        return result;
    }
}
